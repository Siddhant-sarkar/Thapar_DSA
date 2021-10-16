#include<iostream>
using namespace std;

class Node{
public:
	int data;
	Node* next;
};

class LinkedList{
private:
	Node* head,* tail;
public:
	LinkedList(){
		head=NULL;
		tail=NULL;
	}
	void insertAtTail(int data){
		Node* n = new Node;	
		n->data=data;n->next=NULL;

		if(head== NULL){head=n;tail=n;}
		else{
			tail->next=n;
			tail=tail->next;
		}
		tail->next=head;
	}
	void display(){
		if(head== NULL){
			cout<<"The LinkedList is not initialized\n";
		}else{
			Node * n = head;
			do{
				cout<<n->data<<" ";
				n=n->next;
			}while(n!=head);
			cout<<n->data<<endl;
		}
	}

};
LinkedList init(int n){
	LinkedList ll;
	for(int i=0;i<n;i++){
		
	}
}
int main(){
	LinkedList ll;
	ll.insertAtTail(1);
	ll.insertAtTail(2);
	ll.insertAtTail(3);
	ll.insertAtTail(4);
	ll.insertAtTail(5);
	ll.display();
}