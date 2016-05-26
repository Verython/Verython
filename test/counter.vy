@top
def counter (clk, reset; [21:0]count):
    @always(clk.posedge, A, B, C)
    block:
        if (reset):
            count = 0
            finish = 0
        else:
            count += 1
