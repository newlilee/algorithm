# -*- coding: utf-8 -*-

class ArrayUtils:

    def __init__(self):
        super().__init__()

    @staticmethod
    def compare(first: int, second: int) -> bool:
        """
        compare two param
        :param first: first param
        :param second: second param
        :return: return true if fist param grater than second param
        """
        return bool((first - second) > 0)

    @staticmethod
    def swap(array: list[int], first: int, second: int):
        """
        swap
        :param array: an array
        :param first: first param
        :param second: second param
        """
        tmp = array[first]
        array[first] = array[second]
        array[second] = tmp


if __name__ == '__main__':
    util = ArrayUtils()
