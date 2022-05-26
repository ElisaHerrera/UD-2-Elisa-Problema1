import java.util.Iterator;

public class SuperList extends ListManager<Integer>{

    @Override
    public void addElement(Integer element) {
       list.add(element);
    }

    @Override
    public Integer removeElement(int position) {
        list.remove(position);
        for (int i = 0; i <removeElement(1) ; i++) {
            Integer valor=removeElement(1);
            System.out.println(valor);
        }
        return null;
    }

    @Override
    public void showElements() {
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
    }

    @Override
    public void showReversedElements() {
            Collections.reverse(list);
    }
}
