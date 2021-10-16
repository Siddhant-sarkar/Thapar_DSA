#include<iostream>
using namespace std;

class Node{
public:
	char c;
	Node* next;
	Node* prev;
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
	void insertAtTail(char c){
		Node* n = new Node;	
		n->c=c;n->next=NULL;

		if(head== NULL){head=n;tail=n;}
		else{
			tail->next=n;	
			n->prev=tail;
			tail=tail->next;
		}
		size++;
	}
	void display(){
		if(head== NULL){
			cout<<"The LinkedList is not initialized\n";
		}else{
			Node * n = head;
			while(n!=NULL){
				cout<<n->c<<" ";
				n=n->next;
			}
			cout<<endl;
			
		}
	}
	int getsize(){return size;}
	bool isPalindrome() {
		Node* s=head;
		Node* e=tail;
		while(s!=e){
			if(s->c != e->c) return false;
			s=s->next;
			e=e->prev;
		}
		return true;
	}

};
LinkedList init(string s){
	LinkedList ll;
	for(int i=0;i<(int)s.length();i++){
		ll.insertAtTail(s[i]);
	}
	return ll;
}
int main(){
	LinkedList ll = init("abc");
	ll.display();
	bool tf=ll.isPalindrome();
	cout<<"is the doubly linked List a palindrome "<<boolalpha<<tf<<endl;
}