package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.ArrowTurnLeftDown: ImageVector
    get() {
        if (_ArrowTurnLeftDown != null) {
            return _ArrowTurnLeftDown!!
        }
        _ArrowTurnLeftDown = ImageVector.Builder(
            name = "Outlined.ArrowTurnLeftDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveToRelative(11.99f, 16.5f)
                lineToRelative(-3.75f, 3.75f)
                moveToRelative(0f, 0f)
                lineTo(4.49f, 16.5f)
                moveToRelative(3.75f, 3.75f)
                verticalLineTo(3.75f)
                horizontalLineToRelative(11.25f)
            }
        }.build()

        return _ArrowTurnLeftDown!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowTurnLeftDown: ImageVector? = null
