package com.hanlei.leetcode.middle;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName SnapshotArray
 * @Description 
 * @Author hanlei
 * @Date 2021/1/19 下午2:54
 * @Version 1.0
 */
public class SnapshotArray {
    /**
     * 实现支持下列接口的「快照数组」- SnapshotArray：
     * <p>
     * SnapshotArray(int length) - 初始化一个与指定长度相等的 类数组 的数据结构。初始时，每个元素都等于 0。
     * void set(index, val) - 会将指定索引 index 处的元素设置为 val。
     * int snap() - 获取该数组的快照，并返回快照的编号 snap_id（快照号是调用 snap() 的总次数减去 1）。
     * int get(index, snap_id) - 根据指定的 snap_id 选择快照，并返回该快照指定索引 index 的值。
     *  
     * <p>
     * 示例：
     * <p>
     * 输入：["SnapshotArray","set","snap","set","get"]
     * [[3],[0,5],[],[0,6],[0,0]]
     * 输出：[null,null,0,null,5]
     * 解释：
     * SnapshotArray snapshotArr = new SnapshotArray(3); // 初始化一个长度为 3 的快照数组
     * snapshotArr.set(0,5);  // 令 array[0] = 5
     * snapshotArr.snap();  // 获取快照，返回 snap_id = 0
     * snapshotArr.set(0,6);
     * snapshotArr.get(0,0);  // 获取 snap_id = 0 的快照中 array[0] 的值，返回 5
     */

    Map<Integer, Map<Integer, Integer>> mapMap;
    Integer snap = 0;

    public SnapshotArray(int length) {
        mapMap = new HashMap<>();
    }

    public void set(int index, int val) {
        if (mapMap.containsKey(index)) {
            mapMap.get(index).put(snap, val);
        } else {
            Map<Integer, Integer> map = new HashMap<>();
            map.put(snap, val);
            mapMap.put(index, map);
        }
    }

    public int snap() {
        return snap++;
    }

    public int get(int index, int snap_id) {
        Map<Integer, Integer> map = mapMap.get(index);
        do {
            Integer i = map.get(snap_id);
            if (i != 0) {
                return i;
            }
            snap_id --;
        } while (snap_id > 0);
        return 0;
    }

    /**
     * ["SnapshotArray","set","snap","snap","snap","get","snap","snap","get"]
     * [[1],[0,15],[],[],[],[0,2],[],[],[0,0]]
     */
    public static void main(String[] args) {
        SnapshotArray snapshotArr = new SnapshotArray(1);
        snapshotArr.set(0, 15);
        System.out.println(snapshotArr.snap());
        System.out.println(snapshotArr.snap());
        System.out.println(snapshotArr.snap());
        System.out.println(snapshotArr.get(0, 2));
        System.out.println(snapshotArr.snap());
        System.out.println(snapshotArr.snap());
        System.out.println(snapshotArr.get(0, 0));
    }
}
