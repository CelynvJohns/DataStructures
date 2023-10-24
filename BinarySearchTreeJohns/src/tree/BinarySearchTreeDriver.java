package tree;

/**
 * Celyn Johns
 */
public class BinarySearchTreeDriver {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinarySearchTree boysNameTree = new BinarySearchTree();
		BinarySearchTree girlsNameTree = new BinarySearchTree();

		initializeBoysNames(boysNameTree);
		initializeGirlsNames(girlsNameTree);

		System.out.println("Search results in boysNameTree:");
		searchAndPrintNames(boysNameTree, getBoyNames());

		System.out.println("\nSearch results in girlsNameTree:");
		searchAndPrintNames(girlsNameTree, getGirlNames());
	}

	/**
	 * @param tree
	 */
	private static void initializeBoysNames(BinarySearchTree tree) {
		// Insert top 10 boy names into the tree
		String[] boyNames = { "Noah 1", "Liam 2", "Mason 3", "Jacob 4", "William 5", "Ethan 6", "James 7",
				"Alexander 8", "Michael 9", "Benjamin 10" };
		for (String name : boyNames) {
			String[] parts = name.split(" ");
			tree.insert(parts[0], Integer.parseInt(parts[1]));
		}
	}

	/**
	 * @param tree
	 */
	private static void initializeGirlsNames(BinarySearchTree tree) {
		// Insert top 10 girl names into the tree
		String[] girlNames = { "Emma 1", "Olivia 2", "Sophia 3", "Ava 4", "Isabella 5", "Mia 6", "Abigail 7", "Emily 8",
				"Charlotte 9", "Harper 10" };
		for (String name : girlNames) {
			String[] parts = name.split(" ");
			tree.insert(parts[0], Integer.parseInt(parts[1]));
		}
	}

	/**
	 * @return boy names
	 */
	private static String[] getBoyNames() {
		return new String[] { "Noah", "Liam", "Mason", "Jacob", "William", "Ethan", "James", "Alexander", "Michael",
				"Benjamin", "Olivia", "Celyn", "Corbin" };
	}

	/**
	 * @return girl names
	 */
	private static String[] getGirlNames() {
		return new String[] { "Emma", "Olivia", "Sophia", "Ava", "Isabella", "Mia", "Abigail", "Emily", "Charlotte",
				"Harper", "Noah", "Celyn", "Lynn" };
	}

	/**
	 * @param tree
	 * @param names
	 */
	private static void searchAndPrintNames(BinarySearchTree tree, String[] names) {
		for (String name : names) {
			Integer placement = tree.getNodePlacement(name);
			if (placement == -1) {
				placement = null;
			}
			String foundText = placement != null ? "found in the tree." : "not found in the tree.";
			System.out.println("Name: " + name + ", Their placement is: " + (placement != null ? placement : "null")
					+ ", " + foundText);
		}
	}
}
