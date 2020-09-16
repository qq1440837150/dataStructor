import java.util.Iterator;

public interface MyList <E> extends Iterator<E> {
    /**
     * 添加元素
     * @param element 被添加的元素
     */
    void add(E element);

    /**
     * 插入元素
     * @param element 被插入的元素
     * @param position 插入的位置
     */
    void insert(E element,int position);


    /**
     * 删除元素
     * @param position 被删除元素的位置
     * @return 返回被删除的元素
     */
    E erase(int position);

    /**
     * 删除元素
     * @param element 被删除的元素
     * @return 返回被删除的元素
     */
    E erase(E element);

    /**
     * 返回列表的元素个数
     * @return 返回元素的个数
     */
    int size();

    /**
     * 判断是否为空
     * @return 为空返回true，反之为false
     */
    Boolean isEmpty();

    /**
     * 判断列表是否已经达到最大存储数目
     * @return
     */
    Boolean isFull();

}
