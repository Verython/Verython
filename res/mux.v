`timescale 1ns/1ps
module mux(A, B, C, sel, O,)
    input wire [23:0]A;
    input wire [23:0]B;
    input wire [23:0]C;
    input wire [1:0]sel;
    output reg [23:0]O;
    always @(sel or A or B or C)
    begin
        case(sel)
            'd0: O <= 'b10101;
            'd1: O <= B;
            'd2: O <= A;
            default: O <= 'd0;
        endcase
    end
endmodule