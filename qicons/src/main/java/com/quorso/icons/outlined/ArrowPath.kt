package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.ArrowPath: ImageVector
    get() {
        if (_ArrowPath != null) {
            return _ArrowPath!!
        }
        _ArrowPath = ImageVector.Builder(
            name = "Outlined.ArrowPath",
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
                moveTo(16.023f, 9.348f)
                horizontalLineToRelative(4.992f)
                verticalLineToRelative(-0.001f)
                moveTo(2.985f, 19.644f)
                verticalLineToRelative(-4.992f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(4.992f)
                moveToRelative(-4.993f, 0f)
                lineToRelative(3.181f, 3.183f)
                arcToRelative(8.25f, 8.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.803f, -3.7f)
                moveTo(4.031f, 9.865f)
                arcToRelative(8.25f, 8.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.803f, -3.7f)
                lineToRelative(3.181f, 3.182f)
                moveToRelative(0f, -4.991f)
                verticalLineToRelative(4.99f)
            }
        }.build()

        return _ArrowPath!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowPath: ImageVector? = null
