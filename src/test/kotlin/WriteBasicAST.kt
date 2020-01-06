import codes.som.anthony.aksara.assembler.assembleAST
import codes.som.anthony.aksara.ast.*
import codes.som.anthony.aksara.disassembler.writeAST
import codes.som.anthony.aksara.output.BasicOutput
import org.objectweb.asm.ClassWriter
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.Type
import org.objectweb.asm.tree.*
import java.io.PrintStream
import java.nio.file.Files
import java.nio.file.Paths

/*
import java/lang/String
import java/io/PrintStream

// Comment

public com/example/HelloWorld {
    private static message : String

    public static <clinit> void() {
        ldc "Hello, world!"
        putstatic self message String
        return
    }

    public static main void(String[]) {
        getstatic java/lang/System out PrintStream
        getstatic self message String
        invokevirtual PrintStream println void(String)
        return
    }
}
*/

fun main() {
    val prog = AksaraASTProgram()
    prog.imports.add(ImportDeclaration(Type.getType(String::class.java)))
    prog.imports.add(ImportDeclaration(Type.getType(PrintStream::class.java)))

    val helloWorldClass = ClassASTNode(Type.getObjectType("com/example/HelloWorld"), ACC_PUBLIC).apply {
        fields.add(FieldASTNode(ACC_PRIVATE or ACC_STATIC, "message", Type.getType(String::class.java)))

        methods.add(MethodASTNode(ACC_PUBLIC or ACC_STATIC, "<clinit>", Type.VOID_TYPE, emptyArray()).apply {
            code = InsnList().apply {
                add(LdcInsnNode("Hello, world!"))
                add(FieldInsnNode(PUTSTATIC, "com/example/HelloWorld", "message", "Ljava/lang/String;"))
                add(InsnNode(RETURN))
            }
        })

        methods.add(MethodASTNode(ACC_PUBLIC or ACC_STATIC, "main", Type.VOID_TYPE, arrayOf(Type.getType("[Ljava/lang/String;"))).apply {
            code = InsnList().apply {
                add(FieldInsnNode(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;"))
                add(FieldInsnNode(GETSTATIC, "com/example/HelloWorld", "message", "Ljava/lang/String;"))
                add(MethodInsnNode(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V"))
                add(InsnNode(RETURN))
            }
        })
    }

    prog.classes.add(helloWorldClass)

    println(BasicOutput().apply { writeAST(prog, this) }.contents)

    val writer = ClassWriter(0)
    assembleAST(prog).first().accept(writer)

    Files.write(Paths.get("HelloWorld.class"), writer.toByteArray())
}
