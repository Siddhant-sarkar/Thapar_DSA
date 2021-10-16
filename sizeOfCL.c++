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
	int size;
public:
	LinkedList(){
		head=NULL;
		tail=NULL;
		size=0;
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
		size++;
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
	int getsize(){return size;}

};
LinkedList init(int n){
	LinkedList ll;
	for(int i=0;i<n;i++){
		ll.insertAtTail(i+1);
	}
	return ll;
}
int main(){
	LinkedList ll = init(10);
	ll.display();
	cout<<"The size of linked list is "<<ll.getsize()<<endl;
}