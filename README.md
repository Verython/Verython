# Verython

This project translates from a pseudo-Python to Verilog, simplifying the notation and giving all the Python sugar.

## Development documentation
  - [MyHDL](http://www.myhdl.org/): turns Python into a hardware description and verification language.
  - [Python grammar](https://github.com/antlr/grammars-v4/tree/master/python3): Version 3.3.5 Python grammar specification.

## How to compile?
```
antlr4 Verython.g4 -visitor
javac Verython*.java
grun Verython initial -gui
java VerythonMain test.vy
```

## License
[MIT](./LICENSE)
