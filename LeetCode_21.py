# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:


      # Constructor class for new nodes for new list.
        class sortedListNode: 
            def __init__(self, val):
                self.val = val
                self.next = None
        
      # Initialise list with dummy node.
        sortedList = sortedListNode(0)
      # Set current value to track the linked list.
        current = sortedList

        while(list1 != None and list2 != None):
            # If list1 val is less, add new node to list and update list1 
            if(list1.val<=list2.val):
                current.next = sortedListNode(list1.val)
                list1 = list1.next
            # Else update with list 2 value and update list 2
            else:
                current.next = sortedListNode(list2.val)
                list2 = list2.next
        
            # Move pointer to newly added node.
            current = current.next

        # If list 1 empty add on remaining list 2 to end of list
        if(list1 == None):
                current.next = list2
        # Same for list 2
        if(list2 == None):
                current.next = list1

        return sortedList.next
