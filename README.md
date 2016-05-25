# Verython

This project translates from a pseudo-Python to Verilog, simplifying the notation and giving all the Python sugar.

## Development documentation
  - [MyHDL](http://www.myhdl.org/): turns Python into a hardware description and verification language.
  - [Python grammar](https://github.com/antlr/grammars-v4/tree/master/python3): Version 3.3.5 Python grammar specification.

## How to compile?

### GUI
```
antlr4 -visitor -no-listener Verython.g4
javac Verython*.java EvalVisitor.java
grun Verython initial -gui
```

### Main
```
antlr4 -visitor -no-listener Verython.g4
javac Verython*.java EvalVisitor.java
java VerythonMain test.vy
```

## License
[MIT](./LICENSE)
