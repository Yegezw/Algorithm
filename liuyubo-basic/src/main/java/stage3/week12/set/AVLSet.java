package stage3.week12.set;

import port.Set;
import stage3.week12.tree.AVLTree;

public class AVLSet<E extends Comparable<E>> implements Set<E> {

    private final AVLTree<E, Object> avlTree;

    public AVLSet() {
        avlTree = new AVLTree<>();
    }

    @Override
    public void add(E e) {
        avlTree.add(e, null);
    }

    @Override
    public void remove(E e) {
        avlTree.remove(e);
    }

    @Override
    public boolean contains(E e) {
        return avlTree.contains(e);
    }

    @Override
    public int getSize() {
        return avlTree.getSize();
    }

    @Override
    public boolean isEmpty() {
        return avlTree.isEmpty();
    }
}
