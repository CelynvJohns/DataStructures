package tree;

/**
 * Celyn Johns
 */

class BinarySearchTree {
	private Node root;

	/**
	 * @param sData
	 * @param iData
	 */
	public void insert(String sData, int iData) {
		root = insertRec(root, sData, iData);
	}

	private Node insertRec(Node root, String sData, int iData) {
		int zero = 0;
		if (root == null) {
			root = new Node(sData, iData);
			return root;
		}

		if (sData.compareTo(root.sData) < zero)
			root.left = insertRec(root.left, sData, iData);
		else if (sData.compareTo(root.sData) > zero)
			root.right = insertRec(root.right, sData, iData);

		return root;
	}

	/**
	 * @param sData
	 * @return searchRec
	 */
	public boolean search(String sData) {
		return searchRec(root, sData);
	}

	/**
	 * @param root
	 * @param sData
	 * @return true or false
	 */
	private boolean searchRec(Node root, String sData) {
		int zero = 0;
		if (root == null) {
			return false;
		}

		if (sData.compareTo(root.sData) == zero) {
			return true;
		}

		if (sData.compareTo(root.sData) < zero) {
			return searchRec(root.left, sData);
		}

		return searchRec(root.right, sData);
	}

	/**
	 * @param sData
	 * @return NodePlacement
	 */
	public int getNodePlacement(String sData) {
		return getNodePlacementRec(root, sData);
	}

	/**
	 * @param root
	 * @param sData
	 * @return node placement rec
	 */
	private int getNodePlacementRec(Node root, String sData) {
		int zero = 0;
		if (root == null) {
			int none = -1;
			return none; // Name not found
		}

		if (sData.compareTo(root.sData) == zero) {
			return root.iData;
		}

		if (sData.compareTo(root.sData) < zero) {
			return getNodePlacementRec(root.left, sData);
		}

		return getNodePlacementRec(root.right, sData);
	}
}
