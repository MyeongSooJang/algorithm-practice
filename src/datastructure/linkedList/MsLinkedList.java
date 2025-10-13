package datastructure.linkedList;

public class MsLinkedList {
    Node head;

    public MsLinkedList() {
        head = null;
    }

    public void addFirst(int data) {
        // 1. 새 노드를 만든다
        // 2. 새 노드의 next를 현재 head로 설정
        // 3. head를 새 노드로 바꾼다.
        Node newNode = new Node(data);
        newNode.next = head;
        this.head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);

        // ** 리스트가 비어 있는 경우가 있을 수 있음 ** (틀린 부분)
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;

    }

    public void remove(int data) {
        // 리스트가 없는 경우
        if (head == null) {
            return;
        }
        // 첫 번째 것을 삭제하는 경우

        if (head.data == data) {
            head = head.next; // 이게 직관적으로 더 잘보인다.
            return; // <-- 리턴을 해주어야함 삭제 했으니
        }
        // 중간의 것을 삭제하는 경우
        // 3번을 삭제하는 경우 2번의 next를 4번으로 연결해주면 된다.
        Node current = head;

//        while (current.next.data == data) {
//            current.next = current.next.next;
//            current = current.next;
//        }
//        1. 조건이 반대임 - 찾을 때까지 이동해야하는 데, 찾았을때의 조건으로
//        2. NPE 발생 가능 - 끝까지 갔을때 Null 존재 없는 경우 존재하지 않는 경우 마지막 Null 참조로 오류
//        3. 삭제 후 이동 - 삭제했으면 메소드가 마무리 되어야함 그런데 다음으로 이동은 말이 이상함

//        ** 마지막은 순회하지 않게 되고, 다음 것의 data가 같으면 바로 멈춤
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }

    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
