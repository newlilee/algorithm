# -*- coding: utf-8 -*-

from utils.tree_node import TreeNode


class TreeNodeUtils:
    def __init__(self):
        super().__init__()
        self.node_result = []

    def print_tree_node(self, root_node: TreeNode):
        """
        print tree node with root->left->right
        :param root_node:
        :return:
        """
        if root_node is None:
            return None

        self.node_result.append(root_node.val)
        self.print_tree_node(root_node.left)
        self.print_tree_node(root_node.right)


if __name__ == '__main__':
    utils = TreeNodeUtils()
    root = TreeNode(1)
    root.left = TreeNode(2)
    root.left.left = TreeNode(4)
    root.left.right = TreeNode(6)
    root.right = TreeNode(3)
    root.right.left = TreeNode(5)
    root.right.right = TreeNode(8)
    utils.print_tree_node(root)
    print(utils.node_result)
