@top
def mux ([23:0]A, [23:0]B, [23:0]C, [1:0]sel):
    @always(sel or A or C or C)
    block:
        switch(sel):
            case 0:  return A
            case 1:  return B
            case 2:  return A
            default: return 0