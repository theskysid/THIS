#include<stdio.h>
#include<stdlib.h>

    struct Node
{
   int key;
   struct Node *left;
   struct Node *right;
};

struct Node *getSuccessor(struct Node *curr)
{
   curr = curr->right;
   while (curr != NULL && curr->left != NULL)
      curr = curr->left;
   return curr;
}

struct Node *delNode(struct Node *root, int x)
{
   if (root == NULL)
      return root;
   if (root->key > x)
      root->left = delNode(root->left, x);
   else if (root->key < x)
      root->right = delNode(root->right, x);
   else
   {
      if (root->left == NULL)
      {
         struct Node *temp = root->right;
         free(root);
         return temp;
      }
      if (root->right == NULL)
      {
         struct Node *temp = root->left;
         free(root);
         return temp;
      }
      struct Node *succ = getSuccessor(root);
      root->key = succ->key;
      root->right = delNode(root->right, succ->key);
   }
   return root;
}

struct Node *createNode(int key)
{
   struct Node *newNode =
       (struct Node *)malloc(sizeof(struct Node));
   newNode->key = key;
   newNode->left = newNode->right = NULL;
   return newNode;
}

struct Node *search(struct Node *root, int val)
{
   if (root == NULL || root->key == val)
   {
      return root;
   }
   else if (root->key > val)
   {
      return search(root->left, val);
   }
   else
   {
      return search(root->right, val);
   }
}

struct Node *insert(struct Node *root, int val)
{
   if (root == NULL)
   {
      struct Node *p = (struct Node *)malloc(sizeof(struct Node));
      p->key = val;
      p->left = NULL;
      p->right = NULL;
      return p;
   }
   else if (val > root->key)
   {
      root->right = insert(root->right, val);
   }
   else
   {
      root->left = insert(root->left, val);
   }
}

void inorder(struct Node *root)
{
   if (root != NULL)
   {
      inorder(root->left);
      printf("%d ", root->key);
      inorder(root->right);
   }
}
int main()
{
   struct Node *root = createNode(10);
   root->left = createNode(5);
   root->right = createNode(15);
   root->right->left = createNode(12);
   root->right->right = createNode(18);
   int x = 15;
   root = delNode(root, x);
   inorder(root);
   struct Node *ans = search(root, 18);
   if (ans == NULL)
   {
      printf("\nElement Not Found");
   }
   else
   {
      printf("\nElement Found");
   }
   printf("\n After inserting a val in Tree:\n");
   root = insert(root, 56);
   inorder(root);
   return 0;
}