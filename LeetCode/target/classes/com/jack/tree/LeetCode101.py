from typing import Optional

from TreeNode import TreeNode


class Solution:
    def isSymmetric(self, root: Optional[TreeNode]) -> bool:
        if root is None:
            return True
        
        return self.isSymmetric2(root.left, root.right)
        
        
        
    def isSymmetric2(self, left: Optional[TreeNode], right:Optional[TreeNode]) ->bool:
        if left is None and right is None:
            return True
        
        if left is None or right is None:
            return False
        
        return left.val == right.val and self.isSymmetric2(left.left, right.right) and self.isSymmetric2(left.right, right.left)
        


if __name__ == "__main__":
    pass