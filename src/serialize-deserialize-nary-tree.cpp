
// Serialize and deserialize nary tree

#include<cstdio>
#define MARKER ')'
#define N 5
using namespace std;

struct Node {
   char key;
   Node *child[N];  
};

Node *newNode(char key)
{
    Node *temp = new Node;
    temp->key = key;
    for (int i = 0; i < N; i++)
        temp->child[i] = NULL;
    return temp;
}

void serialize(Node *root, FILE *fp)
{
    if (root == NULL) return;

    fprintf(fp, "%c ", root->key);
    for (int i = 0; i < N && root->child[i]; i++)
         serialize(root->child[i],  fp);

    fprintf(fp, "%c ", MARKER);
}

int deSerialize(Node *&root, FILE *fp)
{
    char val;
    if ( !fscanf(fp, "%c ", &val) || val == MARKER )
       return 1;

    root = newNode(val);
    for (int i = 0; i < N; i++)
      if (deSerialize(root->child[i], fp))
         break;

    return 0;
}

Node *createDummyTree()
{
    Node *root = newNode('A');
    root->child[0] = newNode('B');
    root->child[1] = newNode('C');
    root->child[2] = newNode('D');
    root->child[0]->child[0] = newNode('E');
    root->child[0]->child[1] = newNode('F');
    root->child[2]->child[0] = newNode('G');
    root->child[2]->child[1] = newNode('H');
    root->child[2]->child[2] = newNode('I');
    root->child[2]->child[3] = newNode('J');
    root->child[0]->child[1]->child[0] = newNode('K');
    return root;
}

void traverse(Node *root)
{
    if (root)
    {
        printf("%c ", root->key);
        for (int i = 0; i < N; i++)
            traverse(root->child[i]);
    }
}

int main()
{
    Node *root = createDummyTree();

    FILE *fp = fopen("tree.txt", "w");
    if (fp == NULL)
    {
        puts("Could not open file");
        return 0;
    }
    serialize(root, fp);
    fclose(fp);

    Node *root1 = NULL;
    fp = fopen("tree.txt", "r");
    deSerialize(root1, fp);

    printf("Constructed N-Ary Tree from file is \n");
    traverse(root1);

    return 0;
}
