package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.ArrowSmallLeft: ImageVector
    get() {
        if (_ArrowSmallLeft != null) {
            return _ArrowSmallLeft!!
        }
        _ArrowSmallLeft = ImageVector.Builder(
            name = "Outlined.ArrowSmallLeft",
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
                moveTo(19.5f, 12f)
                horizontalLineToRelative(-15f)
                moveToRelative(0f, 0f)
                lineToRelative(6.75f, 6.75f)
                moveTo(4.5f, 12f)
                lineToRelative(6.75f, -6.75f)
            }
        }.build()

        return _ArrowSmallLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowSmallLeft: ImageVector? = null
