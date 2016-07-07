
// Find the nth node from the last of the linked list.

Method : 1

  1. calculate the length of the linked list.
  2. print (length - n + 1)th node from the beginning of the linked list.

Method : 2

  1. maintain two pointers - reference pointer and main pointer.
  2. first move reference pointer to n nodes from head.
  3. now move both pointers one by one until reference pointer reaches to end.
  4. now main pointer will point to the nth node from the end.
