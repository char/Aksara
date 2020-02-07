# *aksara jawa* (Writing of Java)

*aksara* is a Java assembler/disassembler package.

## Example

```aksara
import java.lang.String
import java.lang.System
import java.io.PrintStream

public com/example/HelloWorld {
  public static main void(String[]) {
    getstatic System out PrintStream
    ldc "Hello world!"
    invokevirtual PrintStream println void(String)
    return
  }
}
```

## Plans

- When syntax is finalised, we want to write a TextMate grammar and submit it to things like GitHub Linguist and JetBrains IntelliJ
