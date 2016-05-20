# Verython

This project translates from a pseudo-Python to Verilog, simplifying the notation and giving all the Python sugar.

## Development documentation
  - [MyHDL](http://www.myhdl.org/): turns Python into a hardware description and verification language.
  - [Python grammar](https://docs.python.org/2.7/reference/grammar.html): Version 2.7 Python grammar specification.

## How to compile?
```
antlr4 Verython.g4
javac Verython*.java
grun Verython initial -gui
```

## License
[MIT](./LICENSE)
