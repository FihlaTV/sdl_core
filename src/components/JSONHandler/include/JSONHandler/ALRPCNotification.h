#ifndef ALRPCNOTIFICATION_INCLUDE
#define ALRPCNOTIFICATION_INCLUDE

#include "ALRPCMessage.h"

/**
 * \namespace AppLinkRPC
 * \brief Namespace for AppLink JSON protocol related functionality.
*/ 
namespace AppLinkRPC
{
    /**
     * \class ALRPCNotification
     * \brief Base class for AppLink Json notification messages.
     */
    class ALRPCNotification : public ALRPCMessage
    {
    public:
        /**
         * \brief Constructor
         * \param protocolVersion Version of Applink protocol (currently 1,2)
        */
        ALRPCNotification( unsigned int protocolVersion );

        /**
         * \brief Constructor
         * \param protocolVersion Version of Applink protocol (currently 1,2).
         * \param methodID ID of RPC called by message.
        */
        ALRPCNotification( unsigned int protocolVersion, int methodID);

        /**
         * \brief Default Constructor
        */
        ALRPCNotification(void);

        /**
         * \brief Destructor
        */
        virtual ~ALRPCNotification();

    };

}

#endif
