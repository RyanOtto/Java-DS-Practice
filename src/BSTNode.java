public class BSTNode {
	private int key;
	BSTNode left, right;

	BSTNode(int key) {
		this.key = key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public int getKey() {
		return key;
	}

	public void setLeft(BSTNode left) {
		this.left = left;
	}

	public BSTNode getLeft() {
		return left;
	}

	public void setRight(BSTNode right) {
		this.right = right;
	}

	public BSTNode getRight() {
		return right;
	}

}
