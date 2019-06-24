/**
 * Author: ������
 * Date: 2015-08-21
 * Time: 17:20
 * Declaration: All Rights Reserved !!!
 */
public class Solution {
    /**
     * <pre>
     * ԭ��
     * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
     * Note:
     * You may assume that nums1 has enough space (size that is greater or equal to m + n) to
     * hold additional elements from nums2. The number of elements initialized in nums1 and
     * nums2 are m and n respectively.
     *
     * ��Ŀ����
     * ����������������飬������������кϲ����ϲ���Ҳ������ģ��ϲ���������nums1�С�
     * nums1�����㹻�Ŀռ�����nums2��
     *
     * ����˼·
     * �����������е����һ��λ�ÿ�ʼ���кϲ��������������нϴ���ƶ�������λ�ã����Ǹ���
     * ����λ��ֵ��ǰ�ƶ�һ��λ�ã��ٽ���ͬ���Ĳ�����ֱ�����е�Ԫ�ش����ꡣ
     * </pre>
     *
     * @param arr
     * @param m
     * @param brr
     * @param n
     */
    public void merge(int arr[], int m, int brr[], int n) {
        int pa = m - 1;
        int pb = n - 1;
        int index = m + n - 1;

        while (pa >= 0 && pb >= 0) {
            if (arr[pa] >= brr[pb]) {
                arr[index--] = arr[pa--];
            } else {
                arr[index--] = brr[pb--];
            }
        }

        // ˵��paһ��Ϊ0
        while (pb >= 0) {
            arr[index--] = brr[pb--];
        }

        // ���pa >= 0��˵��[0, pa]��û�н����жϣ���Ϊ[0, pa]������arr�У����Բ�Ҫ�ƶ���
    }
}