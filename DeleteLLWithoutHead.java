// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully: Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
class Node
{
	int data ;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}
*/

//Function to delete a node without any reference to head pointer.
class Solution
{
    void deleteNode(Node del)
    {
        // copy the value of next node and delete the next node
        del.data = del.next.data;
        del.next = del.next.next;
    }
}