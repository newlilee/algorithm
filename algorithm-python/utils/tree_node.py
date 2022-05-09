# -*- coding: utf-8 -*-

class TreeNode:
    def __init__(self, x):
        """
        define binary tree node
        :param x:
        """
        super().__init__()
        self.left = None
        self.right = None
        self.val = x


if __name__ == '__main__':
    root = TreeNode(1)
    print(root.val)
