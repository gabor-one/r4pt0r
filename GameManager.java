public class GameManager {

	private GameState gameState;

	/**
	 * 
	 * @param GameSt
	 */
	public void SetGameState(GameState GameSt) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Main loop.
	 */
	private void Run() {
		throw new UnsupportedOperationException();
	}

	private void UpdateAll() {
		throw new UnsupportedOperationException();
	}

	public GameManager() {
		throw new UnsupportedOperationException();
	}


	public abstract class GameState {

		/**
		 * 
		 * @param Parent
		 */
		public abstract void Update(GameManager Parent);

		public abstract void Draw();

	}


	public class InputManager {

		public void GetInput() {
			throw new UnsupportedOperationException();
		}

		/**
		 * 
		 * @param Clusters
		 */
		public Cluster GetASprayedClusters(Cluster[] Clusters) {
			throw new UnsupportedOperationException();
		}

		/**
		 * 
		 * @param Clusters
		 */
		public Cluster GetBSprayedClusters(Cluster[] Clusters) {
			throw new UnsupportedOperationException();
		}

		public InputManager() {
			throw new UnsupportedOperationException();
		}

	}

}