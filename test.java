public class MyArrayList {

    public int[] elem;
    public int usedSize;

    public int tmp ;

    public MyArrayList() {
        this.elem = new int[10];
        this.usedSize = 0;
    }

    public MyArrayList(int capcity) {
        this.elem = new int[capcity];
        this.usedSize = 0;
    }

    public void add(int pos, int data) {
        if(pos < 0 || pos > this.usedSize) {
            System.out.println("pos位置不合法");
            return;
        }
        if(this.usedSize == this.elem.length) {
            System.out.println("顺序表为满！");
            return;
        }
        for (int i = this.usedSize-1;i >= pos;i--) {
            this.elem[i+1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedSize++;
    }
  
    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }
  
    public boolean contains(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if(this.elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }
 
    public int search(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if(this.elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }
  
    public int getPos(int pos) {
        if(pos < 0 || pos >= this.usedSize) {
            System.out.println("pos位置不合法");
            return -1;
        }
        return this.elem[pos];
    }
  
    public void setPos(int pos, int value) {
        if(pos < 0 || pos > this.usedSize) {
            System.out.println("pos位置不合法");
            return;
        }
        this.elem[pos] = value;
    }
   
    public void remove(int toRemove) {
  
        int index = search(toRemove);
        if(index == -1) {
            System.out.println("没有这个数字");
            return;
        }

        for (int i = index; i < this.usedSize-1; i++) {
            this.elem[i] = this.elem[i+1];
        }
        this.usedSize--;
    }

    public void removeAll(int toRemove) {
        for (int i = 0; i < this.usedSize; i++) {
            remove(toRemove);
        }
    }

    public int size() {
        return this.usedSize;
    }
 
    public void clear() {
        this.usedSize = 0;
    }
}