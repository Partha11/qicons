package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.ServerStack: ImageVector
    get() {
        if (_ServerStack != null) {
            return _ServerStack!!
        }
        _ServerStack = ImageVector.Builder(
            name = "Outlined.ServerStack",
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
                moveTo(5.25f, 14.25f)
                horizontalLineToRelative(13.5f)
                moveToRelative(-13.5f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                moveToRelative(3f, 3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 6f)
                horizontalLineToRelative(13.5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -6f)
                moveToRelative(-16.5f, -3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineToRelative(13.5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                moveToRelative(-19.5f, 0f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.9f, -2.7f)
                lineTo(5.737f, 5.1f)
                arcToRelative(3.375f, 3.375f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.7f, -1.35f)
                horizontalLineToRelative(7.126f)
                curveToRelative(1.062f, 0f, 2.062f, 0.5f, 2.7f, 1.35f)
                lineToRelative(2.587f, 3.45f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.9f, 2.7f)
                moveToRelative(0f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                moveToRelative(0f, 3f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineToRelative(-0.008f)
                verticalLineToRelative(-0.008f)
                close()
                moveTo(18.75f, 11.25f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineToRelative(-0.008f)
                verticalLineToRelative(-0.008f)
                close()
                moveTo(15.75f, 17.25f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineToRelative(-0.008f)
                verticalLineToRelative(-0.008f)
                close()
                moveTo(15.75f, 11.25f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineToRelative(-0.008f)
                verticalLineToRelative(-0.008f)
                close()
            }
        }.build()

        return _ServerStack!!
    }

@Suppress("ObjectPropertyName")
private var _ServerStack: ImageVector? = null
