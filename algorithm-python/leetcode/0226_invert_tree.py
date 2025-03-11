# -*- coding: utf-8 -*-
from typing import Optional

from utils.tree_node import TreeNode
from utils.tree_node_utils import TreeNodeUtils


# 226. invert tree
class InvertTree:
    def __init__(self):
        super().__init__()

    def invert_tree(self, root_node: TreeNode) -> Optional[TreeNode]:
        if root_node is None:
            return None

        tmp_node = root_node.left
        root_node.left = root_node.right
        root_node.right = tmp_node

        self.invert_tree(root_node.left)
        self.invert_tree(root_node.right)
        return root_node


if __name__ == '__main__':
    utils = TreeNodeUtils()
    invertTree = InvertTree()
    root = TreeNode(1)
    root.left = TreeNode(2)
    root.right = TreeNode(3)
    utils.print_tree_node(root)
    print("before invert", utils.node_result)
    utils.node_result.clear()
    result = InvertTree.invert_tree(invertTree, root)
    utils.print_tree_node(result)
    print("after invert", utils.node_result)
