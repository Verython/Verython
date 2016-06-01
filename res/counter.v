`timescale 1ns/1ps
module counter(clk, reset, count);
	input wire clk;
	input wire reset;
	output reg [21:0]count;
	always @(posedge clk or reset)
    begin
    	if (reset) begin
    		count <= 'd0;
    		finish <= 'd0;
    	end
        else begin
    		count <= count + 'd1;
        end
	end
endmodule
