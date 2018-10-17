import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.AfterClass;
import org.junit.Test;

public class Testing {

	private static int points = 0;

	@Test
	public void testingAVLInsertBasics() {
		AVLTree<Integer> b = new AVLTree<Integer>();
		assertTrue(b.insert(5));

		Iterator<Integer> i = b.iterator();
		ArrayList<Integer> m = new ArrayList<Integer>();
		m.add(5);
		ArrayList<Boolean> v = new ArrayList<Boolean>();
		v.add(false);
		assertTrue(i.hasNext());
		for (int k = 0; k < m.size(); k++) {
			assertEquals(m.get(k), i.next());
			assertEquals((boolean) v.get(k), i.hasNext());
		}
		assertEquals(0, b.height());
		assertEquals(0, b.getRotationCount());
		points += 2;
	}

	@Test
	public void testingAVLInsertSingleRightRotation() {
		AVLTree<Integer> b = new AVLTree<Integer>();
		b.insert(7);
		b.insert(9);
		b.insert(5);
		b.insert(3);
		b.insert(1);
		// System.out.println(b);
		Iterator<Integer> i = b.iterator();
		ArrayList<Integer> m = new ArrayList<Integer>();
		m.add(7);
		m.add(3);
		m.add(1);
		m.add(5);
		m.add(9);
		ArrayList<Boolean> v = new ArrayList<Boolean>();
		v.add(true);
		v.add(true);
		v.add(true);
		v.add(true);
		v.add(false);
		assertTrue(i.hasNext());
		for (int k = 0; k < m.size(); k++) {
			assertEquals(m.get(k), i.next());
			assertEquals((boolean) v.get(k), i.hasNext());
		}
		assertEquals(1, b.getRotationCount());
		assertEquals(2, b.height());
		points += 3;
	}

	@Test
	public void testingAVLInsertSingleRightRotationWithRoot() {
		AVLTree<Integer> b = new AVLTree<Integer>();
		b.insert(9);
		b.insert(7);
		b.insert(5);
		Iterator<Integer> i = b.iterator();
		ArrayList<Integer> m = new ArrayList<Integer>();
		m.add(7);
		m.add(5);
		m.add(9);
		ArrayList<Boolean> v = new ArrayList<Boolean>();
		v.add(true);
		v.add(true);
		v.add(false);
		assertTrue(i.hasNext());
		for (int k = 0; k < m.size(); k++) {
			assertEquals(m.get(k), i.next());
			assertEquals((boolean) v.get(k), i.hasNext());
		}
		assertEquals(1, b.getRotationCount());
		assertEquals(1, b.height());
		points += 4;
	}

	@Test
	public void testingAVLInsertDoubleRightRotation() {
		AVLTree<Integer> b = new AVLTree<Integer>();
		b.insert(7);
		b.insert(9);
		b.insert(5);
		b.insert(3);
		b.insert(4);
		Iterator<Integer> i = b.iterator();
		ArrayList<Integer> m = new ArrayList<Integer>();
		m.add(7);
		m.add(4);
		m.add(3);
		m.add(5);
		m.add(9);
		ArrayList<Boolean> v = new ArrayList<Boolean>();
		v.add(true);
		v.add(true);
		v.add(true);
		v.add(true);
		v.add(false);
		assertTrue(i.hasNext());
		for (int k = 0; k < m.size(); k++) {
			assertEquals(m.get(k), i.next());
			assertEquals((boolean) v.get(k), i.hasNext());
		}
		assertEquals(2, b.getRotationCount());
		assertEquals(2, b.height());
		points += 3;
	}

	@Test
	public void testingAVLInsertDoubleRightRotationWithRoot() {
		AVLTree<Integer> b = new AVLTree<Integer>();
		b.insert(9);
		b.insert(5);
		b.insert(7);
		Iterator<Integer> i = b.iterator();
		ArrayList<Integer> m = new ArrayList<Integer>();
		m.add(7);
		m.add(5);
		m.add(9);
		ArrayList<Boolean> v = new ArrayList<Boolean>();
		v.add(true);
		v.add(true);
		v.add(false);
		assertTrue(i.hasNext());
		for (int k = 0; k < m.size(); k++) {
			assertEquals(m.get(k), i.next());
			assertEquals((boolean) v.get(k), i.hasNext());
		}
		assertEquals(2, b.getRotationCount());
		assertEquals(1, b.height());
		points += 4;
	}

	@Test
	public void testingAVLInsertSingleLeftRotation() {
		AVLTree<Integer> b = new AVLTree<Integer>();
		b.insert(3);
		b.insert(1);
		b.insert(5);
		b.insert(7);
		b.insert(9);
		Iterator<Integer> i = b.iterator();
		ArrayList<Integer> m = new ArrayList<Integer>();
		m.add(3);
		m.add(1);
		m.add(7);
		m.add(5);
		m.add(9);
		ArrayList<Boolean> v = new ArrayList<Boolean>();
		v.add(true);
		v.add(true);
		v.add(true);
		v.add(true);
		v.add(false);
		assertTrue(i.hasNext());
		for (int k = 0; k < m.size(); k++) {
			assertEquals(m.get(k), i.next());
			assertEquals((boolean) v.get(k), i.hasNext());
		}
		assertEquals(1, b.getRotationCount());
		assertEquals(2, b.height());
		points += 3;
	}

	@Test
	public void testingAVLInsertSingleLeftRotationWithRoot() {
		AVLTree<Integer> b = new AVLTree<Integer>();
		b.insert(5);
		b.insert(7);
		b.insert(9);
		Iterator<Integer> i = b.iterator();
		ArrayList<Integer> m = new ArrayList<Integer>();
		m.add(7);
		m.add(5);
		m.add(9);
		ArrayList<Boolean> v = new ArrayList<Boolean>();
		v.add(true);
		v.add(true);
		v.add(false);
		assertTrue(i.hasNext());
		for (int k = 0; k < m.size(); k++) {
			assertEquals(m.get(k), i.next());
			assertEquals((boolean) v.get(k), i.hasNext());
		}
		assertEquals(1, b.getRotationCount());
		assertEquals(1, b.height());
		points += 4;
	}

	@Test
	public void testingAVLInsertDoubleLeftRotation() {
		AVLTree<Integer> b = new AVLTree<Integer>();
		b.insert(3);
		b.insert(1);
		b.insert(5);
		b.insert(9);
		b.insert(7);
		Iterator<Integer> i = b.iterator();
		ArrayList<Integer> m = new ArrayList<Integer>();
		m.add(3);
		m.add(1);
		m.add(7);
		m.add(5);
		m.add(9);
		ArrayList<Boolean> v = new ArrayList<Boolean>();
		v.add(true);
		v.add(true);
		v.add(true);
		v.add(true);
		v.add(false);
		assertTrue(i.hasNext());
		for (int k = 0; k < m.size(); k++) {
			assertEquals(m.get(k), i.next());
			assertEquals((boolean) v.get(k), i.hasNext());
		}
		assertEquals(2, b.getRotationCount());
		assertEquals(2, b.height());
		points += 3;
	}

	@Test
	public void testingAVLInsertDoubleLeftRotationWithRoot() {
		AVLTree<Integer> b = new AVLTree<Integer>();
		b.insert(5);
		b.insert(9);
		b.insert(7);
		Iterator<Integer> i = b.iterator();
		ArrayList<Integer> m = new ArrayList<Integer>();
		m.add(7);
		m.add(5);
		m.add(9);
		ArrayList<Boolean> v = new ArrayList<Boolean>();
		v.add(true);
		v.add(true);
		v.add(false);
		assertTrue(i.hasNext());
		for (int k = 0; k < m.size(); k++) {
			assertEquals(m.get(k), i.next());
			assertEquals((boolean) v.get(k), i.hasNext());
		}
		assertEquals(2, b.getRotationCount());
		assertEquals(1, b.height());
		points += 4;
	}

	public void nums(int lower, int upper, Iterator i) {
		if (lower > upper)
			return;
		int mid = (lower + upper) / 2;
		assertEquals(mid, i.next());
		nums(lower, mid - 1, i);
		nums(mid + 1, upper, i);
	}

	@Test
	public void testingStressWithNoRotations() {
		AVLTree<Integer> b = new AVLTree<Integer>();

		// No rotations at all
		int size = 128;
		int v = size / 2;
		int temp;
		while (v > 0) {
			temp = v;
			while (temp < size) {
				b.insert(temp);
				temp += v;
			}
			v = v / 2;
		}
		nums(1, 127, b.iterator());
		assertEquals(0, b.getRotationCount());
		assertEquals(6, b.height());
		points += 6;
	}

	@Test
	public void testingStressRemoval() {
		AVLTree<Integer> b = new AVLTree<Integer>();
		// Creating a tree using no rotations.
		int size = 128; // 128
		int v = size / 2;
		int temp;
		while (v > 0) {
			temp = v;
			while (temp < size) {
				b.insert(temp);
				temp += v;
			}
			v = v / 2;
		}
		// nums(1,127,b.iterator());
		// System.out.println(b);
		assertEquals(0, b.getRotationCount());
		// now, let's see whether we will ever have
		// more than one rotation on removal
		// int rc;
		// int rcc;
		// System.out.println("Testing num rotation: ");
		for (int i = 127; i > 1; i--) {
			// rc = b.getRotationCount();
			assertTrue(b.remove(i));
			assertEquals(i - 1, b.size());
			// rcc = b.getRotationCount();
			// if ((rcc-rc)>1) {
			// System.out.println(rcc-rc);
			// }
		}
		assertEquals(57, b.getRotationCount()); // 57
		assertEquals(0, b.height());
		assertTrue(b.remove(1));
		assertEquals(0, b.size());
		assertEquals(-1, b.height());
		points += 6;
	}

	@Test
	public void testingStressWithOnlySingleLeftRotations() {
		AVLTree<Integer> b = new AVLTree<Integer>();
		int rc;
		int rcc;
		for (int i = 1; i < 128; i++) {
			rc = b.getRotationCount();
			b.insert(i);
			rcc = b.getRotationCount();
			if ((rcc - rc) > 1) {
				System.out.println(rcc - rc);
			}
		}
		nums(1, 127, b.iterator());
		assertEquals(120, b.getRotationCount());
		assertEquals(6, b.height());
		// System.out.println("Tree height is: " + b.height());
		points += 8;
	}

	@Test
	public void testingStressWithOnlySingleRightRotations() {
		AVLTree<Integer> b = new AVLTree<Integer>();
		int rc;
		int rcc;
		for (int i = 127; i >= 1; i--) {
			rc = b.getRotationCount();
			b.insert(i);
			rcc = b.getRotationCount();
			if ((rcc - rc) > 1) {
				System.out.println(rcc - rc);
			}
		}
		nums(1, 127, b.iterator());
		assertEquals(120, b.getRotationCount());
		assertEquals(6, b.height());
		points += 6;
	}

	@Test
	public void testingStressInsertWithOnlyDoubleRotations() {
		AVLTree<Integer> b = new AVLTree<Integer>();
		b = new AVLTree<Integer>();
		int maxx = 64; // 64
		int num = maxx / 2;
		int offset = num;
		int start = offset;
		// int drc;
		// int drcc;
		b.insert(0);
		// System.out.println(0);
		while (num > 0) {
			while (start < maxx) {
				// drc = b.getDoubleRotationCount();
				b.insert(start * 2);
				// System.out.println(start*2);
				// drcc = b.getDoubleRotationCount();
				// if ((drcc-drc)>1) {
				// System.out.println(drcc-drc);
				// }
				// drc = b.getDoubleRotationCount();
				b.insert(start * 2 - 1);
				// System.out.println(start*2-1);
				// drcc = b.getDoubleRotationCount();
				// if ((drcc-drc)>1) {
				// System.out.println(drcc-drc);
				// }
				start += offset;
			}
			offset = num;
			num = num / 2;
			start = num;
		}
		// System.out.println(b);
		nums(0, maxx * 2 - 2, b.iterator()); // 126
		assertEquals(maxx * 2 - 2, b.getRotationCount());// 126
		assertEquals(6, b.height());
		points += 6;
	}

	@Test
	public void testingAVLRemoveBasics() {
		AVLTree<Integer> b = new AVLTree<Integer>();
		assertFalse(b.remove(5));

		assertTrue(b.insert(5));
		assertTrue(b.remove(5));
		assertEquals(0, b.getRotationCount());

		Iterator<Integer> i = b.iterator();
		assertFalse(i.hasNext());
		assertEquals(-1, b.height());
		points += 2;
	}

	@Test
	public void testingAVLRemoveSingleRightRotation() {
		AVLTree<Integer> b = new AVLTree<Integer>();
		b.insert(7);
		b.insert(9);
		b.insert(5);
		b.insert(3);
		b.insert(6);
		b.insert(10);
		b.insert(1);
		b.remove(6);
		Iterator<Integer> i = b.iterator();
		ArrayList<Integer> m = new ArrayList<Integer>();
		m.add(7);
		m.add(3);
		m.add(1);
		m.add(5);
		m.add(9);
		m.add(10);
		ArrayList<Boolean> v = new ArrayList<Boolean>();
		v.add(true);
		v.add(true);
		v.add(true);
		v.add(true);
		v.add(true);
		v.add(false);
		assertTrue(i.hasNext());
		for (int k = 0; k < m.size(); k++) {
			assertEquals(m.get(k), i.next());
			assertEquals((boolean) v.get(k), i.hasNext());
		}
		assertEquals(1, b.getRotationCount());
		assertEquals(2, b.height());
		points += 3;
	}

	@Test
	public void testingAVLRemoveSingleRightRotationWithRoot() {
		AVLTree<Integer> b = new AVLTree<Integer>();
		b.insert(7);
		b.insert(9);
		b.insert(5);
		b.insert(3);
		b.remove(9);
		Iterator<Integer> i = b.iterator();
		ArrayList<Integer> m = new ArrayList<Integer>();
		m.add(5);
		m.add(3);
		m.add(7);
		ArrayList<Boolean> v = new ArrayList<Boolean>();
		v.add(true);
		v.add(true);
		v.add(false);
		assertTrue(i.hasNext());
		for (int k = 0; k < m.size(); k++) {
			assertEquals(m.get(k), i.next());
			assertEquals((boolean) v.get(k), i.hasNext());
		}
		assertEquals(1, b.getRotationCount());
		assertEquals(1, b.height());
		points += 3;
	}

	@Test
	public void testingAVLRemoveDoubleRightRotation() {
		AVLTree<Integer> b = new AVLTree<Integer>();
		b.insert(7);
		b.insert(9);
		b.insert(5);
		b.insert(3);
		b.insert(6);
		b.insert(10);
		b.insert(4);
		b.remove(6);
		Iterator<Integer> i = b.iterator();
		ArrayList<Integer> m = new ArrayList<Integer>();
		m.add(7);
		m.add(4);
		m.add(3);
		m.add(5);
		m.add(9);
		m.add(10);
		ArrayList<Boolean> v = new ArrayList<Boolean>();
		v.add(true);
		v.add(true);
		v.add(true);
		v.add(true);
		v.add(true);
		v.add(false);
		assertTrue(i.hasNext());
		for (int k = 0; k < m.size(); k++) {
			assertEquals(m.get(k), i.next());
			assertEquals((boolean) v.get(k), i.hasNext());
		}
		assertEquals(2, b.getRotationCount());
		assertEquals(2, b.height());
		points += 3;
	}

	@Test
	public void testingAVLRemoveDoubleRightRotationWithRoot() {
		AVLTree<Integer> b = new AVLTree<Integer>();
		b.insert(7);
		b.insert(9);
		b.insert(5);
		b.insert(6);
		b.remove(9);
		Iterator<Integer> i = b.iterator();
		ArrayList<Integer> m = new ArrayList<Integer>();
		m.add(6);
		m.add(5);
		m.add(7);
		ArrayList<Boolean> v = new ArrayList<Boolean>();
		v.add(true);
		v.add(true);
		v.add(false);
		assertTrue(i.hasNext());
		for (int k = 0; k < m.size(); k++) {
			assertEquals(m.get(k), i.next());
			assertEquals((boolean) v.get(k), i.hasNext());
		}
		assertEquals(2, b.getRotationCount());
		assertEquals(1, b.height());
		points += 3;
	}

	@Test
	public void testingAVLRemoveSingleLeftRotation() {
		AVLTree<Integer> b = new AVLTree<Integer>();
		b.insert(3);
		b.insert(1);
		b.insert(5);
		b.insert(2);
		b.insert(4);
		b.insert(7);
		b.insert(9);
		b.remove(4);
		Iterator<Integer> i = b.iterator();
		ArrayList<Integer> m = new ArrayList<Integer>();
		m.add(3);
		m.add(1);
		m.add(2);
		m.add(7);
		m.add(5);
		m.add(9);
		ArrayList<Boolean> v = new ArrayList<Boolean>();
		v.add(true);
		v.add(true);
		v.add(true);
		v.add(true);
		v.add(true);
		v.add(false);
		assertTrue(i.hasNext());
		for (int k = 0; k < m.size(); k++) {
			assertEquals(m.get(k), i.next());
			assertEquals((boolean) v.get(k), i.hasNext());
		}
		assertEquals(1, b.getRotationCount());
		assertEquals(2, b.height());
		points += 3;
	}

	@Test
	public void testingAVLRemoveSingleLeftRotationWithRoot() {
		AVLTree<Integer> b = new AVLTree<Integer>();
		b.insert(3);
		b.insert(1);
		b.insert(5);
		b.insert(7);
		b.remove(1);
		Iterator<Integer> i = b.iterator();
		ArrayList<Integer> m = new ArrayList<Integer>();
		m.add(5);
		m.add(3);
		m.add(7);
		ArrayList<Boolean> v = new ArrayList<Boolean>();
		v.add(true);
		v.add(true);
		v.add(false);
		assertTrue(i.hasNext());
		for (int k = 0; k < m.size(); k++) {
			assertEquals(m.get(k), i.next());
			assertEquals((boolean) v.get(k), i.hasNext());
		}
		assertEquals(1, b.height());
		assertEquals(1, b.getRotationCount());
		points += 3;
	}

	@Test
	public void testingAVLRemoveDoubleLeftRotation() {
		AVLTree<Integer> b = new AVLTree<Integer>();
		b.insert(3);
		b.insert(2);
		b.insert(6);
		b.insert(1);
		b.insert(4);
		b.insert(7);
		b.insert(5);
		b.remove(7);
		Iterator<Integer> i = b.iterator();
		ArrayList<Integer> m = new ArrayList<Integer>();
		m.add(3);
		m.add(2);
		m.add(1);
		m.add(5);
		m.add(4);
		m.add(6);
		ArrayList<Boolean> v = new ArrayList<Boolean>();
		v.add(true);
		v.add(true);
		v.add(true);
		v.add(true);
		v.add(true);
		v.add(false);
		assertTrue(i.hasNext());
		for (int k = 0; k < m.size(); k++) {
			assertEquals(m.get(k), i.next());
			assertEquals((boolean) v.get(k), i.hasNext());
		}
		assertEquals(2, b.height());
		assertEquals(2, b.getRotationCount());
		points += 3;
	}

	@Test
	public void testingAVLRemoveDoubleLeftRotationWithRoot() {
		AVLTree<Integer> b = new AVLTree<Integer>();
		b.insert(3);
		b.insert(1);
		b.insert(5);
		b.insert(4);
		b.remove(1);
		Iterator<Integer> i = b.iterator();
		ArrayList<Integer> m = new ArrayList<Integer>();
		m.add(4);
		m.add(3);
		m.add(5);
		ArrayList<Boolean> v = new ArrayList<Boolean>();
		v.add(true);
		v.add(true);
		v.add(false);
		assertTrue(i.hasNext());
		for (int k = 0; k < m.size(); k++) {
			assertEquals(m.get(k), i.next());
			assertEquals((boolean) v.get(k), i.hasNext());
		}
		assertEquals(1, b.height());
		assertEquals(2, b.getRotationCount());
		points += 3;
	}

	@Test
	public void testMiscellaneousRemoveCases() {
		AVLTree<Integer> b = new AVLTree<Integer>();
		int size = 8;
		int v = size / 2;
		int temp;
		while (v > 0) {
			temp = v;
			while (temp < size) {
				b.insert(temp);
				temp += v;
			}
			v = v / 2;
		}
		b.remove(4);
		b.remove(3);
		b.remove(2);
		Iterator<Integer> i = b.iterator();
		assertTrue(i.hasNext());
		int t1 = i.next();
		assertTrue(i.hasNext());
		int t2 = i.next();
		assertTrue(i.hasNext());
		int t3 = i.next();
		assertTrue(i.hasNext());
		int t4 = i.next();
		assertFalse(i.hasNext());
		if (!(t1 == 6 && t2 == 1 && t3 == 5 && t4 == 7))
			fail();
		points += 4;
	}

	@Test
	public void testingStressRandomInsertionRemoval() {
		AVLTree<Integer> b = new AVLTree<Integer>();
		int nums = 20000;
		for (int i = 0; i < nums; i++) {
			// System.out.println(i);
			b.insert((int) (Math.random() * nums));
			b.height();
		}
		points += 4;
		for (int i = 0; i < nums; i++) {
			// b.remove((int) (Math.random() * nums));
			b.remove(i);
		}
		assertEquals(0, b.size());
		points += 4;
	}

	@AfterClass
	public static void testNothing() {
		System.out.println("Points: " + points);
	}
}
