import pytest

a = 10
b = 20

def Sum_test():
    c = a+b
    assert c == 30

def Sub_test():
    c = a-b
    assert c == 20

@pytest.mark.ctivity
def Mul_test():
    c = a*b
    assert c == 50

@pytest.mark.activity
def Div_test():
    c = a/b
    assert c == 1
