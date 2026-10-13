package dio.budgeting.infrastructure.http.response;

import dio.budgeting.application.output.TransactionOutput;

public record TransactionResponse(String id,String description, String category, double value) {
    public static TransactionResponse from(TransactionOutput transactionOutput){
        return new TransactionResponse(
                transactionOutput.id(),
                transactionOutput.category(),
                transactionOutput.description(),
                transactionOutput.value()
                );
    }
}
