	static void licz(char[] tab) {
		int ile = 0;
		char znak = ' ';
		char[] pom = new char[tab.length];
		
		for(int i=0; i<tab.length; i++) {
			znak = tab[i];
			pom[i] = znak;
			ile = 0;
			
			{
				for(int j=0; j<tab.length; j++) {
					if(znak == tab[j]) {
						ile++;
					}
				}
				
				/*
				for(int k=0; k<pom.length; k++) {
					if(znak==pom[k]) {
			            continue;
					} 
					else {
						System.out.println(znak + " wystapilo " + ile + " razy");
					}
				}
				*/
				
				System.out.println(znak + " wystapilo " + ile + " razy");
			}
		}
			
	}