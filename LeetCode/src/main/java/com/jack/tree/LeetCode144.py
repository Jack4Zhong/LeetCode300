
from typing import List, Optional
from TreeNode import TreeNode


class Solution:
    def preorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        res = []
        
        if root is None:
            return
        
        self.preorder(root, res)
        return res
        
        
    def preorder(self, node: Optional[TreeNode], res: List[int]):
        if node is None: return 
        
        res.append(node.val)
        self.preorder(node.left, res)
        self.preorder(node.right, res)
        


if __name__ == "__main__":
    pass