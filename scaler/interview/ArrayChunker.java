package datastructures.src.com.scaler.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayChunker {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int k = 2;
		List<int[]> chunks = ArrayChunker.chunkArray(arr, k);
		for (int[] chunk : chunks) {
			System.out.println(Arrays.toString(chunk));
		}
	}

	public static List<int[]> chunkArray(int[] arr, int k) {

		List<int[]> chunks = new ArrayList<>();

		int chunkCount = (int) Math.ceil((double) arr.length / k);

		for (int i = 0; i < chunkCount; i++) {

			int start = i * k;
			int end = Math.min(start + k, arr.length);
			int[] chunk = new int[end - start];
			System.arraycopy(arr, start, chunk, 0, chunk.length);
			chunks.add(chunk);
		}

		return chunks;

	}
}
