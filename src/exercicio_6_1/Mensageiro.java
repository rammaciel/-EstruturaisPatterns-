package exercicio_6_1;

import java.util.Calendar;
import java.util.Date;

public class Mensageiro {
	
	public void enviarMensagem() {
		int diaDaSemana = 0;
		
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		
		diaDaSemana = c.get(Calendar.DAY_OF_WEEK);
		
		MensagemDoDia msg;
		
		switch(diaDaSemana) {
		case 2: msg = new MensagemDaSegunda();
		break;
		case 3: msg = new MensagemDaTerca();
		break;
		case 4: msg = new MensagemDaQuarta();
		break;
		case 5: msg = new MensagemDaQuinta();
		break;
		case 6: msg = new MensagemDaSexta();
		break;
		case 7: msg = new MensagemDeSabado();
		break;
		case 1: msg = new MensagemDeDomingo();
		break;
		default: msg = new SemMensagem();
		}
		
		System.out.println(msg.mensagem());
	}
	

}
