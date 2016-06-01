@top
def counter (clk, reset; [21:0]count):
    @always(clk.posedge, reset)
    block:
        if (reset):
            count = 0
            finish = 0
        else:
            count += 1
