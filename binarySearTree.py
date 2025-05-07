class Node:
    
    def __init__(self,  key):
        self.left = None
        self.right = None
        self.value = key
  

    '''
    For the balanced tree insertion:
    - On the left side, the value has to be smaller than the key.
    - On the right side, the value has to be larger than the key.
    '''
    @staticmethod
    def insertion(root, key):
        if root is None:
            return Node(key)
        if root.value == key:
            return root
        if root.value > key:
            root.right = Node.insertion(root.right, key)
        else:
            root.left = Node.insertion(root.left, key)
        
        
    