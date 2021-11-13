import pytest

@pytest.fixtures
def numbers():
    list = [0,1,2,3,4,5,6,7,8,9,10]
    return list

def sum_test(numbers):
    sum = 0
    for n in numbers:
        sum+=n

    assert sum == 55