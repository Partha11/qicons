package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.ChatBubbleOvalLeft: ImageVector
    get() {
        if (_ChatBubbleOvalLeft != null) {
            return _ChatBubbleOvalLeft!!
        }
        _ChatBubbleOvalLeft = ImageVector.Builder(
            name = "Filled.ChatBubbleOvalLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.337f, 21.718f)
                arcToRelative(6.707f, 6.707f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.533f, -0.074f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.44f, -1.223f)
                arcToRelative(3.73f, 3.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.814f, -1.686f)
                curveToRelative(0.023f, -0.115f, -0.022f, -0.317f, -0.254f, -0.543f)
                curveTo(3.274f, 16.587f, 2.25f, 14.41f, 2.25f, 12f)
                curveToRelative(0f, -5.03f, 4.428f, -9f, 9.75f, -9f)
                reflectiveCurveToRelative(9.75f, 3.97f, 9.75f, 9f)
                curveToRelative(0f, 5.03f, -4.428f, 9f, -9.75f, 9f)
                curveToRelative(-0.833f, 0f, -1.643f, -0.097f, -2.417f, -0.279f)
                arcToRelative(6.721f, 6.721f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.246f, 0.997f)
                close()
            }
        }.build()

        return _ChatBubbleOvalLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ChatBubbleOvalLeft: ImageVector? = null
