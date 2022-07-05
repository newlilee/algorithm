# -*- coding: utf-8 -*-
from typing import Optional

from utils.tree_node_utils import TreeNodeUtils


class Node:
    def __init__(self, val):
        super().__init__()
        self.left = None
        self.right = None
        self.val = val
        self.next_node = None


class FillTreeNode:
    def __init__(self):
        super().__init__()

    def fill_tree(self, root_node: Node) -> Optional[Node]:
        if root_node is None:
            return root_node
        self.connect_two_node(root_node.left, root_node.right)
        return root_node

    def connect_two_node(self, first_node: Node, second_node: Node):
        if first_node is None or second_node is Node:
            return
        first_node.next_node = second_node
        self.connect_two_node(first_node.left, first_node.right)
        self.connect_two_node(second_node.left, second_node.right)
        self.connect_two_node(first_node.right, second_node.left)


if __name__ == '__main__':
    utils = TreeNodeUtils()
