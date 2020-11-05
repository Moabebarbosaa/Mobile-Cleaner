package br.edu.ifpb.ActionDashboard.CleaningTipsStrategy;


public class CleaningTips {

    private String tips;
    private ICleaningTips showTips;

    public CleaningTips(String modelSmartphone) {

        switch (modelSmartphone) {
            case "IPHONE":
                showTips = new IphoneTips();
                this.tips = showTips.show();
                break;
            case "XIAOMI":
                showTips = new XiaomiTips();
                this.tips = showTips.show();
                break;
            case "MOTOG":
                showTips = new MotoGTips();
                this.tips = showTips.show();
                break;
            default:
                this.tips = "Não temos dicas para seu smartphone no momento.";
        }
    }

    public String showTipsStrategy() {
        return showTips.show();
    }
}
