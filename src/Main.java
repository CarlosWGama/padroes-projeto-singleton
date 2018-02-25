import sistema.Config;
import sistema.Piano;

public class Main {

	public static void main(String[] args) {
		
		//** INICIA E CONFIGURA O SISTEMA **//
		Config config = new Config();
		config.configuraAudio(50); //50%
		
		//** USUÁRIO TOCA NUMA TECLA DO PIANO **//
		Piano piano = new Piano();
		piano.teclaX(); //Reproduz em 100%
		
	}

}
