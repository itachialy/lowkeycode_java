package ss14_sort;

public class quizz {

        public static int binarySearch(int[] arr, int target) {
            int low = 0; // Điểm bắt đầu của mảng
            int high = arr.length - 1; // Điểm kết thúc của mảng

            while (low <= high) { // Duyệt mảng khi low không vượt qua high
                int mid = (low + high) / 2; // Tìm chỉ số giữa của mảng

                if (arr[mid] == target) { // Nếu phần tử giữa là target
                    return mid; // Trả về chỉ số của target
                } else if (arr[mid] < target) { // Nếu target lớn hơn phần tử giữa
                    low = mid + 1; // Di chuyển low lên phía sau mid
                } else { // Nếu target nhỏ hơn phần tử giữa
                    high = mid - 1; // Di chuyển high lên phía trước mid
                }
            }

            return -1; // Trả về -1 nếu không tìm thấy target trong mảng
        }

        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5, 7, 7, 7, 9, 10}; // Mảng đã sắp xếp tăng dần
            int target = 7; // Phần tử cần tìm trong mảng

            int resultIndex = binarySearch(arr, target); // Gọi hàm tìm kiếm nhị phân

            if (resultIndex != -1) {
                System.out.println("Phần tử " + target + " được tìm thấy tại vị trí index " + resultIndex);
            } else {
                System.out.println("Phần tử " + target + " không có trong mảng.");
            }
        }
    }
