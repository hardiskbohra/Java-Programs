
// find closest element in binary search tree to n. n is the number.

node getClosestNode(node root, int key)
{
    node closest = NULL;
    int minDistance = 0x7FFFFFFF;
    node temp = root;
    while(temp != NULL)
    {
        int distance = abs(temp.data - key);
        if(distance < minDistance)
        {
            minDistance = distance;
            closest = temp;
        }

        if(distance == 0)
            break;

        if(temp.data > key)
            temp = temp.left;
        else if(temp.data < key)
            temp = temp.right;
    }

    return closest;
}
