package net.swofty.types.generic.command.commands;

import net.swofty.types.generic.command.CommandParameters;
import net.swofty.types.generic.command.SkyBlockCommand;
import net.swofty.types.generic.item.attribute.AttributeHandler;
import net.swofty.types.generic.item.updater.PlayerItemOrigin;
import net.swofty.types.generic.item.updater.PlayerItemUpdater;
import net.swofty.types.generic.user.SkyBlockPlayer;
import net.swofty.types.generic.user.categories.Rank;

@CommandParameters(aliases = "recomb",
        description = "Recombobulates the item in the players hand",
        usage = "/recombobulate",
        permission = Rank.ADMIN,
        allowsConsole = false)
public class RecombobulateCommand extends SkyBlockCommand {
    @Override
    public void run(MinestomCommand command) {
        command.addSyntax((sender, context) -> {
            if (!permissionCheck(sender)) return;

            ((SkyBlockPlayer) sender).updateItem(PlayerItemOrigin.MAIN_HAND, (item) -> {
                AttributeHandler attributeHandler = item.getAttributeHandler();
                attributeHandler.setRecombobulated(!attributeHandler.isRecombobulated());
                sender.sendMessage("§aRecombobulated: §d" + attributeHandler.isRecombobulated());
            });
        });
    }
}